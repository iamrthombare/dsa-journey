# Write your MySQL query statement below
Select sample_id,dna_sequence,species,
    dna_sequence Like 'ATG%' as has_start,
    dna_sequence  REGEXP '(TAA|TAG|TGA)$' as has_stop,
    dna_sequence Like '%ATAT%' as has_atat,
    dna_sequence Like '%GGG%' as has_ggg
    from Samples;