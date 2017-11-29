/*
/--- 27/11/2017 - Ronaldo Silveira ---/
 - Alterei o tipo de dados das datas para date, em vez de timestamp

*/

alter table projeto drop DT_INICIO;
alter table projeto add DT_INICIO date;

alter table projeto drop DT_FIM;
alter table projeto add DT_FIM date;
