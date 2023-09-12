import { Route, Routes } from "react-router-dom";
import IndexComponent from "../component/IndexComponent";



export default function IndexRoter(){
    return (
        <Routes>
            <Route path="/" element={<IndexComponent/>}/>
        </Routes>
    )
}