export class BestValueMenu {
    private notifier;
    constructor(notifier: any) {
        this.notifier = notifier;
    }


    serveMenu(): string {
        return "sallad" + "\n"
        + this.mainCourse() + "\n"
        + this.dessert()
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