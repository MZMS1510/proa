SELECT a.nome_aluno, p.nome_professor, p.disciplina_professor
FROM aluno AS a
    RIGHT OUTER JOIN professor AS p ON a.professor_favorito = p.pk_re_professor;

SELECT pk_re_professor, nome_professor FROM professor;

DESCRIBE aluno;

DESCRIBE professor;

DESCRIBE aula;

ALTER TABLE aluno ADD professor_favorito INT;

ALTER TABLE aluno
ADD FOREIGN KEY (professor_favorito) REFERENCES professor (pk_re_professor);

UPDATE aluno SET professor_favorito = 1 WHERE pk_ra_aluno = 1;

DELETE FROM professor WHERE pk_re_professor = 4;