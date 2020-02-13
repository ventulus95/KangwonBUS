'use strict';

import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import '../css/app.scss';

class App extends Component {
    constructor(...args) {
        super(...args);
        this.state = {
            canvasColor: 'default'
        };
    }

    changeColor(color) {
        console.log('chaged');
        this.setState({ canvasColor: color });

    }

    render() {
        let _self = this;
        return (
            <div>
                강원대학교 300번 버스 알림이
            </div>
        );
    }
}
export default App