class CardNews extends HTMLElement {

    constructor() {
        super();

        const shadow = this.attachShadow({mode: "open"});
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
e

    }

    build() {
        const componentRoot = document.createElement("div"); //Estou criando um componente "div"
        componentRoot.setAttribute("class", "card"); //dentro deste componente eu estou setando uma classe card

        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "card__left");
        
        const author = document.createElement("span");
        author.textContent = "por " + (this.getAttribute("author") || "Anônimo");
        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute("title");
        linkTitle.href = this.getAttribute("url-link");
        linkTitle.target = "_blank";
        const noticeContent = document.createElement("p");
        noticeContent.textContent = this.getAttribute("content");

        cardLeft.appendChild(author);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(noticeContent);

        const cardRight = document.createElement("div"); 
        cardRight.setAttribute("class", "card__right"); 

        const noticeImage = document.createElement("img");
        noticeImage.src = this.getAttribute("notice-img") || "assets/image/default-image.webp";

        cardRight.appendChild(noticeImage);

        componentRoot.appendChild(cardLeft); //Estou dizendo que meu componente div chamado cardLeft é filho de componentRoot, está dentro de componentRoot
        componentRoot.appendChild(cardRight);

        return componentRoot;
    }

    styles() {
        const style = document.createElement("style");
        style.textContent = 

        `   
        .card {
    display: flex;
    flex-direction: row;
    width: 70%;
    height: 250px;
    -webkit-box-shadow: 0px 0px 50px -2px #000000bf;
    -moz-box-shadow: 0px 0px 50px -2px #000000bf;
    box-shadow: 0px 0px 50px -2px #000000bf;
    border-radius: 1rem;
    justify-content: space-between;
    margin: 100px auto;
}

.card__left {
    display: flex;
    flex-direction: column;
    justify-content: center;
    padding-left: 10px;
}

.card__left > span {
    font-weight: 400;
}

.card__left > a {
    margin-top: 10px;
    font-size: 25px;
    font-weight: bold;
    text-decoration: none;
    color: #000000
}

.card__left > p {
    color: #565656;
}

.card__right {
    display: flex;
    justify-content: center;
    align-items: center;
}

.card__right > img {
    padding-right: 20px;
    height: 80%;
}
        `
        
        return style;
    }
}

customElements.define("card-news", CardNews);