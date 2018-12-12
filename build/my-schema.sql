create table agendamento_aula_perdida (codigo integer not null auto_increment, data_aula date, local varchar(255), codigo_disciplina integer, codigo_turma integer, primary key (codigo))
create table aluno_matriculado (codigo integer not null auto_increment, matricula varchar(255), data_matricula date, desistencia bit not null, foto varchar(255), matriculado bit not null, motivo_desistencia varchar(255), responsavel_pela_notificacao varchar(255), codigo_disciplina integer, codigo_turma integer, primary key (codigo))
create table aluno_pre_matriculado (codigo integer not null auto_increment, data_pre_matricula date, primary key (codigo))
create table disciplina (codigo integer not null auto_increment, media double precision not null, nome varchar(255), nota1 double precision not null, nota2 double precision not null, codigo_professor integer, primary key (codigo))
create table professor (codigo integer not null auto_increment, matricula varchar(255), primary key (codigo))
create table turma (codigo integer not null auto_increment, data_inicio date, data_termino date, modulo varchar(255), quantidade_alunos integer, primary key (codigo))
alter table agendamento_aula_perdida add constraint FKm0vjr2c2mnme5k1phu4m382ar foreign key (codigo_disciplina) references disciplina (codigo)
alter table agendamento_aula_perdida add constraint FKff7wppxoh21tcularc0sil5f4 foreign key (codigo_turma) references turma (codigo)
alter table aluno_matriculado add constraint FK25ggnmmwx6pwvofwksnpr4s2j foreign key (codigo_disciplina) references disciplina (codigo)
alter table aluno_matriculado add constraint FKdqyasc3q1vtfet23djtc4ystw foreign key (codigo_turma) references turma (codigo)
alter table disciplina add constraint FKqi1vaw28jp15ejffvhu5b23yk foreign key (codigo_professor) references professor (codigo)
