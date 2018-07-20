import * as React from "react";
import * as ReactDOM from "react-dom";
import App from "./app";
import { loadIcons } from "./config/icon-loader";

loadIcons();

const rootEl = document.getElementById("root");

const render = Component => ReactDOM.render(<App />, rootEl);

render(App);

// This is quite unstable
// if (module.hot) {
//   module.hot.accept('./app', () => {
//     const NextApp = require<{ default: typeof AppComponent }>('./app').default;
//     render(NextApp);
//   });
// }
