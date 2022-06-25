import React, {useEffect, useState} from "react";
import ToDoService from "../service/ToDoService";

function ToDoComponent() {

    const [todos, setToDo] = useState([])

    useEffect(() => {
        getToDo()

    }, [])

    const getToDo = () => {
        ToDoService.getToDO().then((response) => {
            setToDo(response.data)
            console.log(response.data);
        });
    };

    return (
        <div className="container">
            <h1 className="text-center"> ToDos list</h1>

            <table className="table table-striped">
                <thead>
                <tr>
                    <th> ToDos Id</th>
                    <th> ToDos name</th>
                    <th> ToDos description</th>
                    <th> ToDos status</th>
                </tr>

                </thead>
                <tbody>
                {
                    todos.map(
                        todos =>
                            <tr key={todos.id}>
                                <td> {todos.id}</td>
                                <td> {todos.name}</td>
                                <td> {todos.description}</td>
                                <td> {todos.status}</td>
                            </tr>
                    )
                }
                </tbody>

            </table>

        </div>
    )

}

export default ToDoComponent