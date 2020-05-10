/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author Dominic
 */

/**
public class Server {
        public static void main(String[] args) throws Exception {
        System.out.println("\nStarting Server.");

        Server server = new Server();

        CompletableFuture.runAsync(() -> {
            server.start();
        });

        server.onStarted(() -> {
            System.out.println("\nPress Enter to stop the server");
        });

        //wait for user to hit the enter key
        System.in.read();
        System.exit(0);
    }

}
*/
