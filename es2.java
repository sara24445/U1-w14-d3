SELECT O.*
FROM Ordini O
JOIN Prodotti P ON O.id_Prodotto = P.id
WHERE P.Categoria = 'Baby';