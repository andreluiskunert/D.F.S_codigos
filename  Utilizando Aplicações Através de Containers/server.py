# # server {
# # 	listen 80;

# #     server_name localhost;

# #     root /var/www/html;

# #     location / {
# # 		index  index.html index.htm;
# # 		try_files $uri $uri/ /index.html;
# #     }
# # }
# # services:
# #     servidor_web:
# #         image: nginx:latest
# #         container_name: nginx_servidor
# #         volumes:
# #             - ./html:/var/www/html
# #             - ./conf/nginx/default.conf:/etc/nginx/conf.d/default.conf
# #         ports:
# #             - 8098:80
# #         restart: always
# server {
# 	listen 80;

#     server_name localhost;

#     root /var/www/html;

#     location / {
# 		index  index.html index.htm;
# 		try_files $uri $uri/ /index.html;
#     }
# }