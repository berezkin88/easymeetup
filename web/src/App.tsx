import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import { Route, Switch } from 'react-router-dom';
import Base from './components/Base/Base';
import AdminCms from './components/Admin-cms/AdminCms';
import Events from './components/events/Events';
import './App.css';
import Login from './components/auth/Login';
import Registration from './components/auth/Registration';
import Profile from './components/profile/Profile';

class App extends Component {
  render() {
    return (
      <Switch>
        <Route path="/events/" component={Events} />
        <Route path="/cms" component={AdminCms}/>
        <Route path="/login" component={Login}/>
        <Route path="/registration" component={Registration}/>
        <Route exact path="/" component={Base}/>
        <Route path="/profile" component={Profile}/>
      </Switch>
    );
  }
}

export default App;
