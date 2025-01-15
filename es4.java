SELECT O.*
FROM Ordini O
JOIN Clienti C ON O.id_Cliente = C.id
WHERE C.tier = 2 
AND O.Data_Ordine BETWEEN '2021-02-01' AND '2021-04-30';