/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, {
/******/ 				configurable: false,
/******/ 				enumerable: true,
/******/ 				get: getter
/******/ 			});
/******/ 		}
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "/";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 0);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports, __webpack_require__) {

__webpack_require__(1);
module.exports = __webpack_require__(2);


/***/ }),
/* 1 */
/***/ (function(module, exports) {


/**
 * First we will load all of this project's JavaScript dependencies which
 * includes Vue and other libraries. It is a great starting point when
 * building robust, powerful web applications using Vue and Laravel.
 */

//require('./bootstrap');

//window.Vue = require('vue');

/**
 * Next, we will create a fresh Vue application instance and attach it to
 * the page. Then, you may begin adding components to this application
 * or customize the JavaScript scaffolding to fit your unique needs.
 */

//Vue.component('example-component', require('./components/ExampleComponent.vue'));

//const app = new Vue({
//    el: '#app'
//});

/***/ }),
/* 2 */
/***/ (function(module, exports) {

throw new Error("Module build failed: ModuleNotFoundError: Module not found: Error: Can't resolve '../images/icons/submenu-dark.png' in 'F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\public\\css'\n    at factoryCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\webpack\\lib\\Compilation.js:282:40)\n    at factory (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\webpack\\lib\\NormalModuleFactory.js:237:20)\n    at resolver (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\webpack\\lib\\NormalModuleFactory.js:60:20)\n    at asyncLib.parallel (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\webpack\\lib\\NormalModuleFactory.js:127:20)\n    at F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\async\\dist\\async.js:3888:9\n    at F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\async\\dist\\async.js:473:16\n    at iteratorCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\async\\dist\\async.js:1062:13)\n    at F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\async\\dist\\async.js:969:16\n    at F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\async\\dist\\async.js:3885:13\n    at resolvers.normal.resolve (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\webpack\\lib\\NormalModuleFactory.js:119:22)\n    at onError (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:65:10)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at runAfter (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:158:4)\n    at innerCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:146:3)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at next (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\tapable\\lib\\Tapable.js:252:11)\n    at F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\UnsafeCachePlugin.js:40:4\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at runAfter (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:158:4)\n    at innerCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:146:3)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at next (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\tapable\\lib\\Tapable.js:252:11)\n    at innerCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:144:11)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at next (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\tapable\\lib\\Tapable.js:249:35)\n    at resolver.doResolve.createInnerCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\DescriptionFilePlugin.js:44:6)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at afterInnerCallback (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\Resolver.js:168:10)\n    at loggingCallbackWrapper (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\enhanced-resolve\\lib\\createInnerCallback.js:31:19)\n    at next (F:\\JunnRepository\\Project\\magnitude\\magnitude_laravel\\node_modules\\tapable\\lib\\Tapable.js:252:11)");

/***/ })
/******/ ]);