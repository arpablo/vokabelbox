import "./app.css";

import * as React from "react";
import AppNavbar from "./navigation";
import BoxList from "app/entities/box/boxlist";

export default class App extends React.Component {
  render() {
    const paddingTop = "60px";
    return (
      <div className="app">
        <AppNavbar />
        <BoxList />
      </div>
    );
  }
}
