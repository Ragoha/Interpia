import { Component } from "react";
import { Outlet } from "react-router-dom";



class MainComponent extends Component {

    constructor(props){
        super(props);
    }

    render(){

        return (
            <div>MainCompoent
                <br/>
                <Outlet/>
            </div>
        )
    }
}


export default MainComponent;