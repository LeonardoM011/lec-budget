CREATE TABLE client(
    id BIGSERIAL PRIMARY KEY,
    username TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    authority_id BIGINT CONSTRAINT authority_fk REFERENCES authority(id),
    created_at TIMESTAMP NOT NULL,
    last_login TIMESTAMP NOT NULL
);

CREATE TABLE authority(
    id BIGSERIAL PRIMARY KEY,
    name TEXT UNIQUE NOT NULL
);

CREATE TABLE category(
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    created_by BIGINT CONSTRAINT created_by_fk REFERENCES client(id),
    modified_at TIMESTAMP NOT NULL
);

CREATE TABLE entry(
    id BIGSERIAL PRIMARY KEY,
    description TEXT NOT NULL,
    price DECIMAL NOT NULL,
    category_id BIGINT CONSTRAINT category_fk REFERENCES category(id),
    created_at TIMESTAMP NOT NULL,
    modified_at TIMESTAMP NOT NULL
);