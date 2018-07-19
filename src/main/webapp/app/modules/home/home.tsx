import "./home.css";

import * as React from "react";
import { Link } from "react-router-dom";
import { Translate } from "react-jhipster";
import { connect } from "react-redux";
import { Row, Col, Alert } from "reactstrap";

import { IRootState } from "app/shared/reducers";
import { getSession } from "app/shared/reducers/authentication";

export interface IHomeProp extends StateProps, DispatchProps {}

export class Home extends React.Component<IHomeProp> {
  componentDidMount() {
    this.props.getSession();
  }

  render() {
    const { account } = this.props;
    return (
      <Row>
        <Col md="9">
          <h2>
            <Translate contentKey="home.title">
              Welcome, Java Hipster!
            </Translate>
          </h2>
          <p className="lead">
            <Translate contentKey="home.subtitle">
              This is your homepage
            </Translate>
          </p>
          <p>
            <Translate contentKey="home.question">
              If you have any question on JHipster:
            </Translate>
          </p>

          <ul>
            <li>
              <a
                href="https://www.jhipster.tech/"
                target="_blank"
                rel="noopener noreferrer"
              >
                <Translate contentKey="home.link.homepage">
                  JHipster homepage
                </Translate>
              </a>
            </li>
            <li>
              <a
                href="http://stackoverflow.com/tags/jhipster/info"
                target="_blank"
                rel="noopener noreferrer"
              >
                <Translate contentKey="home.link.stackoverflow">
                  JHipster on Stack Overflow
                </Translate>
              </a>
            </li>
            <li>
              <a
                href="https://github.com/jhipster/generator-jhipster/issues?state=open"
                target="_blank"
                rel="noopener noreferrer"
              >
                <Translate contentKey="home.link.bugtracker">
                  JHipster bug tracker
                </Translate>
              </a>
            </li>
            <li>
              <a
                href="https://gitter.im/jhipster/generator-jhipster"
                target="_blank"
                rel="noopener noreferrer"
              >
                <Translate contentKey="home.link.chat">
                  JHipster public chat room
                </Translate>
              </a>
            </li>
            <li>
              <a
                href="https://twitter.com/java_hipster"
                target="_blank"
                rel="noopener noreferrer"
              >
                <Translate contentKey="home.link.follow">
                  follow @java_hipster on Twitter
                </Translate>
              </a>
            </li>
          </ul>

          <p>
            <Translate contentKey="home.like">
              If you like JHipster, do not forget to give us a star on
            </Translate>{" "}
            <a
              href="https://github.com/jhipster/generator-jhipster"
              target="_blank"
              rel="noopener noreferrer"
            >
              Github
            </a>!
          </p>
        </Col>
        <Col md="3" className="pad">
          <span className="hipster rounded" />
        </Col>
      </Row>
    );
  }
}

const mapStateToProps = storeState => ({
  account: storeState.authentication.account,
  isAuthenticated: storeState.authentication.isAuthenticated
});

const mapDispatchToProps = { getSession };

type StateProps = ReturnType<typeof mapStateToProps>;
type DispatchProps = typeof mapDispatchToProps;

export default connect(mapStateToProps, mapDispatchToProps)(Home);
