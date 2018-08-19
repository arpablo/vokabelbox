import * as React from "react";
import { Button, ButtonGroup, Table, Td, Th, Container } from "reactstrap";
import FontAwesomeIcon from "@fortawesome/react-fontawesome";
import { IBox } from "app/shared/model/box.model";
import { Navigation } from "app/shared/model/navigation.model";
import { Navigator } from "app/modules/navigator";
interface IBoxListProps {
  path: string;
}

interface IBoxListState {
  isLoading: boolean;
  nav: Navigation;
  boxes: IBox[];
}
export default class BoxList extends React.Component<{}, IBoxListState> {
  constructor(props: IBoxListProps) {
    super(props);
    this.state = {
      isLoading: true,
      nav: new Navigation(),
      boxes: []
    };
  }

  componentDidMount() {
    fetch("http://localhost:8080/api/repo/boxes")
      .then(response => response.json())
      .then(data => {
        this.setState({
          isLoading: false,
          nav: new Navigation(data._links),
          boxes: data._embedded.boxes
        });
        // alert(JSON.stringify(this.state.nav));
      });
  }

  render() {
    if (this.state.isLoading) {
      return <p>Loading...</p>;
    }
    const boxList = this.state.boxes.map(box => (
      <tr key={box.id}>
        <Td>{box.name}</Td>
        <td>
          <ButtonGroup className="float-right">
            <Button size="sm" color="primary">
              <FontAwesomeIcon icon="pencil-alt" />
            </Button>
            <Button size="sm" color="danger">
              <FontAwesomeIcon icon="trash" />
            </Button>
          </ButtonGroup>
        </td>
      </tr>
    ));
    return (
      <Container fluid>
        <div className="float-right">
          <Button color="success">Neue Box</Button>
        </div>
        <h3>Boxen</h3>
        <div className="wfrog">
          <Table hover responsive size="sm">
            <thead>
              <tr>
                <Th>Name</Th>
                <Th width="20%">Aktion</Th>
              </tr>
            </thead>
            <tbody>{boxList}</tbody>
          </Table>
          <Navigator />
        </div>
      </Container>
    );
  }
}
