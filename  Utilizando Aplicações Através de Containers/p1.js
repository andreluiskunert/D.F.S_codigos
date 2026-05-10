// // class ShoppingList extends React.Component {
// //   render() {
// //     return (
// //       <div className="shopping-list">
// //         <h1>Lista de compras para {this.props.name}</h1>
// //         <ul>
// //           <li>Instagram</li>
// //           <li>WhatsApp</li>
// //           <li>Oculus</li>
// //         </ul>
// //       </div>
// //     );
// //   }
// // }

// // // Exemplo de uso: <ShoppingList name="Mark" /> 
// // npx create-react-app nome-do-app
// // npx npm start
// // npx npm create vite@latest nome-do-app
// // npx npm install
// // npx npm run dev -- --host
// // import { defineConfig } from 'vite'
// // import react from '@vitejs/plugin-react'

// // export default defineConfig({
// //   plugins: [react()],
// //   server: {
// //     watch: {
// //       usePolling: true,
// //     },
// //     host: true, 
// //     strictPort: true,
// //     port: 5173 
// //   }
// // }) 
// // npx npm install react-bootstrap bootstrap
// // npx npm install axios
// // import 'bootstrap/dist/css/bootstrap.min.css';
// import axios from 'axios';

// const AxiosInstance = axios.create({
//   baseURL: "http://127.0.0.1:3099",
// });

// export default AxiosInstance; 
// import { useState, useEffect } from "react";
// import Container from "react-bootstrap/Container";
// import Table from "react-bootstrap/Table";
// import Row from "react-bootstrap/Row";
// import Col from "react-bootstrap/Col";
// import AxiosInstance from "../../api/AxiosInstance";
// import Button from "react-bootstrap/Button";
// import Form from "react-bootstrap/Form";
// import Navbar from "react-bootstrap/Navbar";

// const Home = () => {
//   const [country, setCountry] = useState(null);
//   const [codPais, setCodPais] = useState("");
//   const [isLoading, setLoading] = useState(false);

//   const getCountryById = async () => {
//     AxiosInstance.get(`/country/${codPais}`)
//       .then((result) => {
//         console.log("result1 data: " + JSON.stringify(result.data));
//         setCountry(result.data);
//         setLoading(true);
//       })
//       .catch(function (error) {
//         console.log("teste1: " + error.toJSON());
//       });
//   };

//   return (
//     <Container className="p-3">
//       <Navbar bg="primary p-3 mb-5">
//         <Navbar.Brand>Menu</Navbar.Brand>
//       </Navbar>
//       <Form>
//         <Form.Group as={Row} className="mb-3" controlId="cod_pais">
//           <Form.Label column sm={4}>
//             Código do País:
//           </Form.Label>
//           <Col sm={6}>
//             <Form.Control
//               type="cod_pais"
//               placeholder="código do país"
//               onChange={(event) => {
//                 setCodPais(event.target.value);
//               }}
//             />
//           </Col>
//           <Col sm={2}>
//             <Button variant="primary" onClick={() => getCountryById()}>
//               Pesquisar
//             </Button>
//           </Col>
//         </Form.Group>
//       </Form>
//       {isLoading && (
//         <Table striped bordered hover>
//           <thead>
//             <tr>
//               <th>#</th>
//               <th>Nome</th>
//               <th>Capital</th>
//               <th>Moeda</th>
//               <th>População</th>
//             </tr>
//           </thead>
//           <tbody>
//             {country.map((k, i) => (
//               <tr>
//                 <td>{k.id}</td>
//                 <td>{k.name}</td>
//                 <td>{k.capital}</td>
//                 <td>{k.currency}</td>
//                 <td>{k.population}</td>
//               </tr>
//             ))}
//           </tbody>
//         </Table>
//       )}
//     </Container>
//   );
// };

// export default Home; 
// fastify.register(require("@fastify/cors"), {
//   origin: "*",
//   methods: ["POST", "GET", "PUT", "DELETE"]
// }); 
// npx npm install @fastify/cors
// npx npm install
// import Home from './pages/Home'

// function App() {
//   return (
//     <>
//       <Home />
//     </>
//   )
// }

// export default App 
// docker-compose up --build
// docker system prune -a
// docker volume prune