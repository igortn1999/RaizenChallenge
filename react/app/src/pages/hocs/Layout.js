import React from "react";
import Backbar from "../../components/backbar";
import Navbar from "../../components/navbar";

const Layout = (props) => {
  return (
    <div style={{width:'100%'}}>
      <Backbar />
      {props.children}
      <Navbar />
    </div>
  );
};

export default Layout;