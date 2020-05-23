/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import org.jooby.Jooby;
import org.jooby.Results;

/**
 *
 * @author zoude603
 */
public class AssetModule extends Jooby {

    public AssetModule() {
        assets("/*.html");
        assets("/assets/*.jpg");
        assets("/assets/*.png");
        assets("/font/*.ttf");
        assets("/handson.css");
        assets("/js/*.js");
        assets("/assets/*.png");
        // make index.html the default page
        assets("/", "index.html");
        // prevent 404 errors due to browsers requesting favicons
        get("/favicon.ico", () -> Results.noContent());
    }
}
