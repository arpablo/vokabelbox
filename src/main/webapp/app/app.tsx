import "./app.css";

import * as React from "react";
import VocabList from "app/modules/vocab/vocablist";

export default class App extends React.Component {
  render() {
    const paddingTop = "60px";
    return (
      <div className="app-container" style={{ paddingTop }}>
        <VocabList />
      </div>
    );
  }
}
