
-- Roles
INSERT INTO ROLE (STR_ROLE)VALUES('Gerente');
INSERT INTO ROLE (STR_ROLE)VALUES('Supervisor');
INSERT INTO ROLE (STR_ROLE)VALUES('Administrativo');

-- Profiles
INSERT INTO PROFILE (STR_PROFILE)VALUES('Administrador');
INSERT INTO PROFILE (STR_PROFILE)VALUES('Comum');

-- Input test
INSERT INTO USER (dat_birth,
                  num_profile_id,
                  num_role_id,
                  status,
                  str_cpf,
                  str_gender,
                  str_name)
            values('1995-03-08',1,1,1,'12345678901','Masculino','João Pedro');


