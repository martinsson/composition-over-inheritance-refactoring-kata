import {Notifier} from "./Notifier";

export class BestValueMenu {
    private notifier;
    constructor(notifier: Notifier) {
        this.notifier = notifier;
    }


    serveMenu(): string {
        return this.starter() + "\n"
        + this.mainCourse() + "\n"
        + this.dessert()
    }

    private starter() {
        return "sallad";
    }

    protected mainCourse() {
        this.allergenNotificiation("quiche lorraine", "milk")
        return "quiche lorraine";
    }

    protected dessert() {
        this.allergenNotificiation("brownie", "nuts")
        return "brownie";
    }

    protected allergenNotificiation(plate: string, allergen: string) {
        this.notifier.log(`[Allergen]: ${plate} contains ${allergen}` )
    }
}