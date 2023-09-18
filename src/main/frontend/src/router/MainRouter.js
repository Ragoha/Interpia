import { Component } from "react";
import { Route, Routes } from "react-router-dom";
import EmpComponent from "../component/EmpComponent";
import MainComponent from "../component/MainComponent";


class MainRouter extends Component {

    render() {
        return (
            <Routes>
                <Route path="/interpia" element={<MainComponent/>}>
                    <Route path="/interpia/emp" element={<EmpComponent/>}/>
                </Route>
            </Routes>
        )
    }

}


export default MainRouter;