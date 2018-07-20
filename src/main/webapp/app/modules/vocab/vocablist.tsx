import * as React from "react";
import { Button, Table, Row, Badge } from "reactstrap";
import FontAwesomeIcon from "@fortawesome/react-fontawesome";

export default class VocabList extends React.Component {
  render() {
    return (
      <div>
        <Table responsive striped>
          <thead>
            <tr>
              <th>Original</th>
              <th>Übersetzung</th>
              <th>Aktion</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Test</td>
              <td>teste</td>
              <td className="text-right">
                <Button>
                  <FontAwesomeIcon icon="eye" />
                  View
                </Button>
                <Button>
                  <FontAwesomeIcon icon="pencil-alt" />
                  Edit
                </Button>
                <Button>
                  <FontAwesomeIcon icon="trash" />
                  Delete
                </Button>
              </td>
            </tr>
          </tbody>
        </Table>
      </div>
    );
  }
}
