import * as React from "react";
import { Nav, Navbar, NavItem, NavLink } from "reactstrap";

export default class AppNavbar extends React.Component {
  render() {
    return (
      <Navbar color="dark" dark expand="md">
        <Nav className="ml-auto" navbar>
          <NavItem>
            <NavLink href="https://twitter.com">Twitter</NavLink>
          </NavItem>
        </Nav>
      </Navbar>
    );
  }
}
