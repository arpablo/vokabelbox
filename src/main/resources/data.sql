insert into arp_box(id, name) values (1,'Substantive');
insert into arp_box(id, name) values (2, 'Verben');
insert into arp_box(id, name) values (3, 'Adjektive');
insert into arp_box(id, name) values (4, 'Zahlen');

insert into arp_vocab(id, level, source_text, target_text) values(1,1,'hübsch','guapo/a');
insert into arp_vocab(id, level, source_text, target_text) values(2,1,'groß','alto/a');
insert into arp_vocab(id, level, source_text, target_text) values(3,1,'klein','pequeño/a');

insert into arp_box2vocab(box_id, vocab_id) values(3,1);
insert into arp_box2vocab(box_id, vocab_id) values(3,2);
insert into arp_box2vocab(box_id, vocab_id) values(3,3);