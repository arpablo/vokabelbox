import * as React from "react";
import { Pagination, PaginationItem, PaginationLink } from "reactstrap";

const fIcon = "\u00ab";
const iconPrev = "\u2039";

export class Navigator extends React.Component {
  render() {
    return (
      <Pagination>
        <First icon={fIcon} />
        <First icon={iconPrev} />
        <PaginationItem>
          <PaginationLink previous />
        </PaginationItem>
        <PaginationItem>
          <PaginationLink next />
        </PaginationItem>
      </Pagination>
    );
  }
}

const First = ({ icon }) => (
  <PaginationItem>
    <a className="page-link" href="#" aria-label="Next">
      <span aria-hidden="true">{icon}</span>
      <span className="sr-only">Next</span>
    </a>
  </PaginationItem>
);
