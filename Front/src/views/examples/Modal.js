
import Header from 'components/Headers/Header';
import React, { Component, useState, useEffect } from 'react';
// reactstrap components
import {
  Button,
  Card,
  CardHeader,
  CardBody,
  FormGroup,
  Form,
  Input,
  InputGroupAddon,
  InputGroupText,
  InputGroup,
  Modal,
  Row,
  Col
} from "reactstrap";

function Modals() {
 
    const [exampleModal,setExampleModal]= useState(false);
  
  const toggleModal = () => {
   setExampleModal(!exampleModal);
  };
  
    return (
      <>
      <Header />
        {/* Button trigger modal */}
        <Button
          color="primary"
          type="button"
          onClick={toggleModal}
        >
          Launch demo modal
        </Button>
        {/* Modal */}
        <Modal
          className="modal-dialog-centered"
          isOpen={exampleModal}
          toggle={toggleModal}
        >
          <div className="modal-header">
            <h5 className="modal-title" id="exampleModalLabel">
              Modal title
            </h5>
            <button
              aria-label="Close"
              className="close"
              data-dismiss="modal"
              type="button"
              onClick={toggleModal}
            >
              <span aria-hidden={true}>×</span>
            </button>
          </div>
          <div className="modal-body">...</div>
          <div className="modal-footer">
            <Button
              color="secondary"
              data-dismiss="modal"
              type="button"
              onClick={toggleModal}
            >
              Close
            </Button>
            <Button color="primary" type="button">
              Save changes
            </Button>
          </div>
        </Modal>
      </>
    );
  }


export default Modals;