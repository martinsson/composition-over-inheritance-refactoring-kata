import {BestValueMenu} from "./BestValueMenu";
import {GourmetsMenu} from "./GourmetsMenu";
import {MeatLoversMenu} from "./MeatLoversMenu";
import {Notifier} from "./Notifier";

describe('BestValueMenu', function () {

    function inMemoryNotifier() {
        const messages: string[] = []
        return {
            log(message: string) {
                messages.push(message)
            },
            loggedMessages(): string[] {
                return messages
            }
        };
    }

    let console: Notifier
    beforeEach(function () {
        console = inMemoryNotifier()
    });

    it('should serve Best value menu', function () {
        const menu = new BestValueMenu(console);
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "quiche lorraine\n" +
            "brownie");
        expect(console.loggedMessages()).toEqual([
            "[Allergen]: quiche lorraine contains milk",
            "[Allergen]: brownie contains nuts"]
        )
    });

    it('should serve GormetsMenu', function () {
        const menu = new GourmetsMenu(console);
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "quiche lorraine\n" +
            "creme caramel");
        expect(console.loggedMessages()).toEqual([
            "[Allergen]: quiche lorraine contains milk",
            "[Allergen]: creme caramel contains milk"]
        )
    });

    it('should serve MeatLoversMenu', function () {
        const menu = new MeatLoversMenu(console);
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "filet mignon\n" +
            "brownie");
        expect(console.loggedMessages()).toEqual([
            "[Allergen]: brownie contains nuts"]
        )
    });
});