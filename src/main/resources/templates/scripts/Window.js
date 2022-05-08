WindowController = class  {
    constructor() {
        this.settings = new WindowModel();
    }
    build(){
        $('#content').append(this.viewWindow(this.settings.content));
    }
    Show(){

        let owindow =
            {

                position: this.settings.p===''?this.settings.p='center':this.settings.p,
                isModal: this.settings.modal,
                showCollapseButton: true,
                height: this.settings.h===0?this.settings.h=20:this.settings.h,
                width: this.settings.w===0?this.settings.w=20:this.settings.w,
                maxHeight: this.settings.maxh,
                minHeight: this.settings.minh,
                minWidth: this.settings.minw,
                maxWidth: this.settings.maxw,
                resizable: this.settings.r,
                zIndex: this.settings.z?this.settings.z=20:this.settings.z,
                animationType:'combined',
                collapsed: this.settings.min
            }
        $('#' + this.settings.name +' #Title')[0].innerText = this.settings.title;
        //$('#' + this.name);
        $('#' + this.settings.name).jqxWindow(owindow);
        $('#' + this.settings.name).on('close', function (event) {
            if(event.target.id.indexOf("WND")===0){
                $('#' + this.settings.name).jqxWindow('destroy');

            }
        });
    }
    viewWindow(content){
        let str = '<div id="' + this.settings.name + '"><div class="HeaderFill" id="Header"><span id="Title"></span></div><div>' + content + '</div></div>';
        return str;
    }
    Close(){
        $('#' + this.settings.name).jqxWindow('destroy');
    }

};
WindowModel = class{
    constructor(){
        this.name = '';
        this.title = '';
        this.w = 0;
        this.h = 0;
        this.maxh = 0;
        this.minh = 0;
        this.minw = 0;
        this.maxw = 0;
        this.p = '';
        this.z = 0;
        this.content = '';
        this.source = {};
        this.modal;
        this.RowSource = {};
        this.r = true;
        this.min = false;
    }
}