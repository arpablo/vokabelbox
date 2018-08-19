insert into arp_box(id, box_name) values (1,'Substantive');
insert into arp_box(id, box_name) values (2, 'Verben');
insert into arp_box(id, box_name) values (3, 'Adjektive');
insert into arp_box(id, box_name) values (4, 'Zahlen');
insert into arp_box(id, box_name) values (5, 'Farben');

insert into arp_vocab(id, level, source_text, target_text) values(1,1,'hübsch','guapo/a');
insert into arp_vocab(id, level, source_text, target_text) values(2,1,'groß','alto/a');
insert into arp_vocab(id, level, source_text, target_text) values(3,1,'klein','pequeño/a');
insert into arp_vocab(id, level, source_text, target_text) values(4,1,'glücklich','feliz');
insert into arp_vocab(id, level, source_text, target_text) values(5,1,'billig','barrato/a');
insert into arp_vocab(id, level, source_text, target_text) values(6,1,'weiß','blanco/a');
insert into arp_vocab(id, level, source_text, target_text) values(7,1,'blau','azul');
insert into arp_vocab(id, level, source_text, target_text) values(8,1,'gelb','amarillo/a');

insert into arp_box2vocab(box_id, vocab_id) values(3,1);
insert into arp_box2vocab(box_id, vocab_id) values(3,2);
insert into arp_box2vocab(box_id, vocab_id) values(3,3);
insert into arp_box2vocab(box_id, vocab_id) values(3,4);
insert into arp_box2vocab(box_id, vocab_id) values(3,5);
insert into arp_box2vocab(box_id, vocab_id) values(3,6);
insert into arp_box2vocab(box_id, vocab_id) values(3,7);
insert into arp_box2vocab(box_id, vocab_id) values(3,8);

insert into arp_box2vocab(box_id, vocab_id) values(5,6);
insert into arp_box2vocab(box_id, vocab_id) values(5,7);
insert into arp_box2vocab(box_id, vocab_id) values(5,8);