import * as React from "react";
import { Button, Table, Row, Badge } from "reactstrap";
import FontAwesomeIcon from "@fortawesome/react-fontawesome";
import { IBox } from "app/shared/model/box.model";
interface IVocabListProps {
  path: string;
}

interface IVocabListState {
  isLoading: boolean;
  vocabs: IBox[];
}
export default class VocabList extends React.Component<
  IVocabListProps,
  IVocabListState
> {
  constructor(props: IVocabListProps) {
    super(props);
    this.state = {
      isLoading: true,
      vocabs: []
    };
  }

  componentDidMount() {
    fetch("http://localhost:8080/api/repo/boxes")
      .then(response => response.json())
      .then(data =>
        this.setState({ isLoading: false, vocabs: data._embedded.boxes })
      );
  }

  render() {
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
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
              <td>{this.state.vocabs[1].name}</td>
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
