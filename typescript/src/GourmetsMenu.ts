import {BestValueMenu} from "./BestValueMenu";

export class GourmetsMenu extends BestValueMenu {

    protected dessert(): string {
        this.allergenNotificiation("creme caramel", "milk")
        return "creme caramel";
    }
}