/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


"use strict";

var clicker = document.getElementById("clicker");
var modal = document.getElementById("modal");

//clicker.onclick = function() {
//    modal.style.display = "block";
//};
//
//window.onclick = function() {
//    modal.style.display = "none";
//};


// MODULE CODE BELOW
// create a new module, and load the other pluggable modules
var module = angular.module('handsonAPP', ['ngResource', 'ngStorage']);

module.factory('registerDAO', function ($resource) {
    return $resource('/api/register');
});

module.factory('signInDAO', function ($resource) {
    return $resource('/api/students/:username');
});

// STUDENT CONTROLLER
module.controller('StudentController', function (registerDAO, signInDAO, $sessionStorage, $window) {

    this.signInMessage = "Please sign in to continue.";
this.signUpMessage="signUp";
    this.registerStudent = function (student) {
        
        registerDAO.save(null, student,
                // success callback
                        function () {
                          
                            $window.location = "signIn.html";
                        },
                        // error callback
                                function (error) {
                                    console.log(error);
                                }
                        );
                    };

            this.signOut = function () {
                $sessionStorage.$reset();
                $window.location.href = '.';
            };

            // alias 'this' so that we can access it inside callback functions
            let ctrl = this;
            this.signIn = function (username, password) {
                // get customer from web service
                signInDAO.get({'username': username},
                        // success
                                function (student) {
                                    // also store the retrieved student
                                    $sessionStorage.student = student;
                                    // redirect to home
                                    $window.location.href = 'studenthome.html';
                                },
                                // fail
                                        function () {
                                            ctrl.signInMessage = 'Sign in failed. Please try again.';
                                        }
                                );
                            };

                    this.checkSignIn = function () {
                        // if customer exists in session storage
                        if ($sessionStorage.student) {
                            this.signedIn = true;
                            this.welcome = "Welcome, " + $sessionStorage.student.firstname + " " + $sessionStorage.student.lastname;
                        }
                    };
                });

