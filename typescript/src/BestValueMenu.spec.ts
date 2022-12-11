import {BestValueMenu} from "./BestValueMenu";
import {GourmetsMenu} from "./GourmetsMenu";
import {MeatLoversMenu} from "./MeatLoversMenu";

describe('BestValueMenu', function () {

    it('should serve Best value menu', function () {
        const menu = new BestValueMenu();
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "quiche lorraine\n" +
            "brownie");
    });


    it('should serve GormetsMenu', function () {
        const menu = new GourmetsMenu();
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "quiche lorraine\n" +
            "creme caramel");
    });

    it('should serve MeatLoversMenu', function () {
        const menu = new MeatLoversMenu();
        const result = menu.serveMenu();
        expect(result).toEqual("sallad\n" +
            "filet mignon\n" +
            "brownie");
    });
});