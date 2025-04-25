INSERT INTO jogadoresCS (nome, nickname, funcao, rating, foto_url, rede_social) VALUES ('Kaike Cerato', 'KSCERATO', 'Rifler', 1.18, 'https://img.hltv.org/playerbody/2029.png', 'https://twitter.com/kscerato');
INSERT INTO jogadoresCS (nome, nickname, funcao, rating, foto_url, rede_social) VALUES ('Yuri Santos', 'yuurih', 'Rifler', 1.16, 'https://img.hltv.org/playerbody/8562.png', 'https://twitter.com/yuurihcs');
INSERT INTO jogadoresCS (nome, nickname, funcao, rating, foto_url, rede_social) VALUES ('Marcelo Cespedes', 'chelo', 'Entry Fragger', 1.05, 'https://img.hltv.org/playerbody/13921.png', 'https://twitter.com/chelolol1');
INSERT INTO jogadoresCS (nome, nickname, funcao, rating, foto_url, rede_social) VALUES ('Gabriel Toledo', 'FalleN', 'AWPer / IGL', 1.01, 'https://img.hltv.org/playerbody/2023.png', 'https://twitter.com/fallencs');
INSERT INTO jogadoresCS (nome, nickname, funcao, rating, foto_url, rede_social) VALUES ('Andrei Piovezan', 'arT', 'In-Game Leader', 0.99, 'https://img.hltv.org/playerbody/13915.png', 'https://twitter.com/arTcsgo');

INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('FURIA no topo', 'A FURIA foi o primeiro time brasileiro a atingir o top 3 do ranking mundial da HLTV após SK Gaming.', 'furia');
INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('FalleN é lenda', 'FalleN é considerado o "Professor" do CS brasileiro, bicampeão mundial e mentor de várias gerações.', 'jogador');
INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('Major no Brasil', 'O IEM Rio Major 2022 foi o primeiro Major de CS:GO realizado no Brasil, com torcida histórica no Jeunesse Arena.', 'campeonato');
INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('Estilo da FURIA', 'A FURIA é conhecida pelo estilo de jogo agressivo, comandado por arT, com estratégias ousadas desde o começo do round.', 'furia');
INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('KSCERATO e yuurih', 'A dupla KSCERATO e yuurih é considerada uma das mais consistentes do CS mundial, jogando junta desde 2018.', 'jogador');
INSERT INTO curiosidades (titulo, descricao, categoria) VALUES ('CS:GO virou CS2', 'Em 2023, a Valve lançou o Counter-Strike 2 (CS2), substituindo oficialmente o CS:GO após mais de 10 anos.', 'cs');

INSERT INTO loja (nome, descricao, preco, imagem_url, categoria) VALUES ('Camisa Oficial FURIA 2024', 'Camisa oficial usada pela line-up de CS2. Edição 2024 com tecido tecnológico.', 159.90, 'https://loja.furia.gg/camisa2024.jpg', 'vestuário');
INSERT INTO loja (nome, descricao, preco, imagem_url, categoria) VALUES ('Boné FURIA Preto', 'Boné com logo bordado, estilo casual e ajustável. Ideal para representar a tropa.', 89.90, 'https://loja.furia.gg/bonepreto.jpg', 'acessório');
INSERT INTO loja (nome, descricao, preco, imagem_url, categoria) VALUES ('Camiseta Casual FURIA Branco Logo Preto', 'Camiseta 100% algodão com logo da FURIA estampado em preto.', 99.90, 'https://loja.furia.gg/camisetabranca.jpg', 'vestuário');
INSERT INTO loja (nome, descricao, preco, imagem_url, categoria) VALUES ('Mousepad FURIA XL', 'Mousepad estendido com superfície premium e base emborrachada. Perfeito para jogos.', 129.90, 'https://loja.furia.gg/mousepadxl.jpg', 'periférico');
INSERT INTO loja (nome, descricao, preco, imagem_url, categoria) VALUES ('Jaqueta Corta-Vento FURIA', 'Jaqueta corta-vento com design estiloso e discreto. Ideal pra qualquer clima.', 249.90, 'https://loja.furia.gg/jaquetacortavento.jpg', 'vestuário');

INSERT INTO noticias (titulo, conteudo, fonte_url, data_publicacao) VALUES ('YEKINDAR é o novo reforço da FURIA', 'A FURIA anunciou a contratação de YEKINDAR como stand-in para os torneios PGL Astana, IEM Dallas e BLAST Austin Major 2025.', 'https://draft5.gg/equipe/330-FURIA/resultados?utm_source=chatgpt.com', '2025-04-20');
INSERT INTO noticias (titulo, conteudo, fonte_url, data_publicacao) VALUES ('FURIA tem aproveitamento de 70% nos últimos jogos', 'Nos últimos 10 confrontos, a FURIA conquistou 7 vitórias, com aproveitamento de 70%.', 'https://egamersworld.com/counterstrike/team/furia-Hk8nWWQjet5M?utm_source=chatgpt.com', '2025-04-15');
INSERT INTO noticias (titulo, conteudo, fonte_url, data_publicacao) VALUES ('FURIA é eliminada na semifinal do IEM Rio 2024', 'Mesmo com o apoio da torcida brasileira, a FURIA foi derrotada pela MOUZ por 13-3 em dois mapas.', 'https://as.com/meristation/mexico/intel-extreme-masters-rio-2024-la-renovacion-del-gran-torneo-de-counter-strike-2-n/?utm_source=chatgpt.com', '2024-10-13');
INSERT INTO noticias (titulo, conteudo, fonte_url, data_publicacao) VALUES ('FURIA se prepara para os próximos torneios', 'A equipe brasileira já está treinando forte para os campeonatos PGL Astana, IEM Dallas e BLAST Austin Major 2025.', 'https://draft5.gg/equipe/330-FURIA/resultados?utm_source=chatgpt.com', '2025-04-23');

INSERT INTO proximos_jogos (adversario, data_jogo, hora_jogo, torneio, local, status) VALUES ('MOUZ', '2025-04-28', '14:00', 'IEM Dallas', 'Dallas, EUA', 'Agendado');
INSERT INTO proximos_jogos (adversario, data_jogo, hora_jogo, torneio, local, status) VALUES ('Team Liquid', '2025-05-05', '18:00', 'BLAST Premier Spring', 'Londres, Reino Unido', 'Agendado');
INSERT INTO proximos_jogos (adversario, data_jogo, hora_jogo, torneio, local, status) VALUES ('G2 Esports', '2025-05-12', '20:30', 'PGL Major', 'Astana, Cazaquistão', 'Agendado');
INSERT INTO proximos_jogos (adversario, data_jogo, hora_jogo, torneio, local, status) VALUES ('Natus Vincere', '2025-05-19', '16:00', 'IEM Cologne', 'Colônia, Alemanha', 'Agendado');
INSERT INTO proximos_jogos (adversario, data_jogo, hora_jogo, torneio, local, status) VALUES ('Cloud9', '2025-05-25', '15:00', 'DreamHack Masters', 'Malmo, Suécia', 'Agendado');

INSERT INTO Perguntas (texto) VALUES ('Quem é o capitão atual da FURIA?');
INSERT INTO Perguntas (texto) VALUES ('Qual jogador da FURIA é conhecido por sua agressividade?');
INSERT INTO Perguntas (texto) VALUES ('Qual desses campeonatos a FURIA venceu?');
INSERT INTO Perguntas (texto) VALUES ('Em que país a organização FURIA foi fundada?');
INSERT INTO Perguntas (texto) VALUES ('Qual jogador da FURIA é destaque no ranking HLTV?');
INSERT INTO Perguntas (texto) VALUES ('Qual o principal patrocinador da FURIA em 2024?');
INSERT INTO Perguntas (texto) VALUES ('Qual o nome do coach (treinador) da FURIA?');
INSERT INTO Perguntas (texto) VALUES ('Em que ano a FURIA foi fundada?');
INSERT INTO Perguntas (texto) VALUES ('Qual o mapa mais jogado pela FURIA em 2023?');
INSERT INTO Perguntas (texto) VALUES ('Qual o maior rival da FURIA no cenário brasileiro?');

-- Pergunta 1
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('FalleN', true, 1);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('KSCERATO', false, 1);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('arT', false, 1);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('drop', false, 1);

-- Pergunta 2
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('arT', true, 2);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('saffee', false, 2);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('chelo', false, 2);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('FalleN', false, 2);

-- Pergunta 3
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('IEM Rio', true, 3);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('PGL Antwerp', false, 3);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('BLAST Premier', false, 3);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('ESL One Cologne', false, 3);

-- Pergunta 4
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Brasil', true, 4);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Estados Unidos', false, 4);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Canadá', false, 4);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Alemanha', false, 4);

-- Pergunta 5
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('KSCERATO', true, 5);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('yuurih', false, 5);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('chelo', false, 5);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('FalleN', false, 5);

-- Pergunta 6
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Red Bull', true, 6);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Nike', false, 6);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Coca-Cola', false, 6);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Adidas', false, 6);

-- Pergunta 7
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('guerri', true, 7);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('zews', false, 7);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('dead', false, 7);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Apoka', false, 7);

-- Pergunta 8
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('2017', true, 8);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('2019', false, 8);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('2015', false, 8);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('2013', false, 8);

-- Pergunta 9
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Mirage', true, 9);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Dust2', false, 9);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Ancient', false, 9);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Vertigo', false, 9);

-- Pergunta 10
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('MIBR', true, 10);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('Imperial', false, 10);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('00Nation', false, 10);
INSERT INTO Respostas (texto, correta, pergunta_id) VALUES ('paiN Gaming', false, 10);

