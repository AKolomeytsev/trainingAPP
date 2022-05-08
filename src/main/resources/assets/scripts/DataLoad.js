DataLoad = class {
    constructor(url,filter,contCont) {
        this.request = new XMLHttpRequest();
        this.url = url;
        this.filter = filter;
        this.contCont = contCont;
    }

    getQuery(){
        this.request.open("GET", `/${this.url}/${this.filter}`, true);
        this.request.setRequestHeader("Content-Type", "application/json");
        this.request.addEventListener("load", function () {
            let data = JSON.parse(this.request.response);

        });
        this.request.send();
    }
}