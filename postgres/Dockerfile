FROM postgres

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 1234
ENV POSTGRES_DB postgres

COPY tabela.sql /docker-entrypoint-initdb.d/
COPY dados.sql /docker-entrypoint-initdb.d/ 


