export class BestValueMenu {

    serveMenu(): string {
        return "sallad" + "\n"
        + this.mainCourse() + "\n"
        + this.dessert()
    }

    protected mainCourse() {
        return "quiche lorraine";
    }

    protected dessert() {
        return "brownie";
    }
}