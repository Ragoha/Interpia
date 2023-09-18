import { BrowserRouter } from "react-router-dom";
import IndexRoter from "./IndexRouter";
import MainRouter from "./MainRouter";


export default function Routers() {

    return (
        <BrowserRouter>
            <IndexRoter/>
            <MainRouter/>
        </BrowserRouter>
    )
}