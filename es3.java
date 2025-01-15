SELECT id, Nome, Prezzo, Prezzo * 0.90 AS Prezzo_Scontato
FROM Prodotti
WHERE Categoria = 'Boys';