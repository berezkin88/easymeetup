import React, { Component } from "react";
import { Grid, Paper } from "@material-ui/core";
import { makeStyles } from '@material-ui/core/styles';

const useStyles = makeStyles({
    paper: {
        height: 140,
        width: 100,
        color: "grey",
    },
});

class Profile extends Component {
  render() {
    return (
      <Grid container spacing={2}>
        <Grid item xs={12}>
          <Grid container justify="center" spacing={2}>
            {[0, 1, 2].map(value => (
              <Grid key={value} item>
                <Paper className={useStyles().paper}/>
              </Grid>
            ))}
          </Grid>
        </Grid>
      </Grid>
    );
  }
}

export default Profile;
