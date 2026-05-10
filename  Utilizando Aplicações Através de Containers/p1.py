# # COMPOSE_PROJECT_NAME : ${COMPOSE_PROJECT_NAME}
# # MYSQL_HOST: ${MYSQL_HOST}
# # MYSQL_USER: ${MYSQL_USER}
# # MYSQL_PASSWORD: ${MYSQL_PASSWORD}
# # MYSQL_ROOT_HOST: ${MYSQL_HOST}
# # MYSQL_ROOT_PASSWORD: ${MYSQL_ROOT_PASSWORD}
# # MYSQL_DATABASE: ${MYSQL_DATABASE}
# # # 
# # ["CMD", "mysqladmin", "ping", "-h", "127.0.0.1", "--silent"]
# # - '3098:3000'
# # command: bash -c 'while !</dev/tcp/db/3306; do sleep 1; done; npm run migrate; npm run seed; nodemon index.js'
# # COMPOSE_PROJECT_NAME="api_node_mysql"
# # MYSQL_USER="user_bd"
# # MYSQL_PASSWORD="user_passwd!"
# # MYSQL_ROOT_PASSWORD="user_passwd!"
# # MYSQL_DATABASE="apirest"
# # MYSQL_HOST="%"
# # DB_PORT="3306"
# # DOCKER_DB_HOST="db"
# # FASTIFY_DB_DRIVER="mysql"
# # FASTIFY_DB_DIALECT="mysql"
# # FASTIFY_DB_QUERY_PARAMS="?"
# # COMPOSE_PROJECT_NAME="api_node_mysql"
# # MYSQL_USER="user_bd"
# # MYSQL_PASSWORD="user_passwd!"
# # MYSQL_ROOT_PASSWORD="user_passwd!"
# # MYSQL_DATABASE="apirest"
# # MYSQL_HOST="%"
# # DB_PORT="3306"
# # DOCKER_DB_HOST="db"
# # FASTIFY_DB_DRIVER="mysql"
# # FASTIFY_DB_DIALECT="mysql"
# # FASTIFY_DB_QUERY_PARAMS="?"
# # {
# #     "name": "api-rest",
# #     "version": "1.0.0",
# #     "description": "API Rest Dockerizada",
# #     "main": "index.js",
# #     "author": "",
# #     "private": true,
# #     "license": "UNLICENSED",
# #     "scripts": {
# #       "start": "node index.js",
# #       "migrate": "node scripts/migrate.js",
# #       "seed": "node scripts/seed.js"
# #     },
# #     "dependencies": {
# #       "fastify": "^4.17.0",   
# #       "@fastify/mysql": "^4.1.0",   
# #       "knex": "^2.4.2", 
# #       "morgan": "^1.10.0", 
# #       "mysql": "^2.18.1" 
# #     }
# #   }
# FROM node:slim

# #Etapa 1: copia o package.json e instala as dependencias em diretorio especifico
# WORKDIR /src/

# #Opcional: instala o bash e o procps
# RUN /bin/sh -c "apt-get install bash"
# RUN apt-get update && apt-get install -y procps

# #Copia o arquivo de dependencias para o workdir
# COPY frontend/package*.json ./
# RUN npm install && npm cache clean --force

# #Adiciona o diretorio contendo a pasta node_modules para o PATH. Com isso as dependencias poderao ser vistas a partir da pasta da aplicacao
# ENV PATH /src/node_modules/.bin:$PATH

# #Etapa 2: altera o diretorio para o da aplicacao e copia os arquivos do projeto para o mesmo
# WORKDIR /src/app
# COPY frontend/ .

# EXPOSE 5173

# CMD ["npm", "run", "dev"] 
#     healthcheck:
#       test: curl --fail http://localhost:3000 || exit 1
#       interval: 15s
#       retries: 5
#       start_period: 15s
#       timeout: 10s
#     links:
#       - backend
#     depends_on:
#       backend:
#         condition: service_healthy 
# //Define um endpoint GET para a listagem de todos os paises cadastrados
# fastify.get('/country', function (req, reply) {
#   fastify[db_dialect].query(
#     `SELECT id, name, capital, currency, population FROM country `,
#     function onResult (err, result) {
#       reply.send(err || result.rows || result)
#     }
#   )
# })
# import { useState, useEffect } from "react";
# import Container from "react-bootstrap/Container";
# import Table from "react-bootstrap/Table";
# import AxiosInstance from "../../api/AxiosInstance";
# import Navbar from "react-bootstrap/Navbar";

# const Home = () => {
#   const [country, setCountry] = useState([]);
#   const [isLoading, setLoading] = useState(false);

#   useEffect(() => {
#     getCountries();
#   }, []);

#   const getCountries = async () => {
#     AxiosInstance.get(`/country`)
#       .then((result) => {
#         console.log("countries: " + JSON.stringify(result.data));
#         setCountry(result.data);
#         setLoading(true);
#       })
#       .catch(function (error) {
#         console.log("Erro no getCountries: " + error.toJSON());
#       });
#   };

#   return (
#     <Container className="p-3">
#       <Navbar bg="primary p-3 mb-5">
#         <Navbar.Brand>Menu</Navbar.Brand>
#       </Navbar>
#       {isLoading && (
#         <Table striped bordered hover>
#           <thead>
#             <tr>
#               <th>#</th>
#               <th>Nome</th>
#               <th>Capital</th>
#               <th>Moeda</th>
#               <th>População</th>
#             </tr>
#           </thead>
#           <tbody>
#             {country.map((k, i) => (
#               <tr>
#                 <td>{k.id}</td>
#                 <td>{k.name}</td>
#                 <td>{k.capital}</td>
#                 <td>{k.currency}</td>
#                 <td>{k.population}</td>
#               </tr>
#             ))}
#           </tbody>
#         </Table>
#       )} 
#     </Container>
#   );
# };

# export default Home;