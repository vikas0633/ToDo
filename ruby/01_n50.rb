#===
# N50.rb
# Shuji Shigenobu <shige@nibb.ac.jp>
# Usage:
#   ruby N50.rb fasta.file
#===
 
require 'rubygems'
require 'bio'
 
include Bio
 
fastas = []
 
FlatFile.open(FastaFormat, ARGF).each do |fa|
  fastas << fa
end
 
fastas.sort!{|a, b| b.seq.length <=> a.seq.length}
total_bases = fastas.map{|fa| fa.seq.length}.inject(0){|i, j| j += i}
 
cum = 0
fastas.each_with_index do |fa, i|
  begin
    puts [i+1, fa.entry_id, fa.seq.length, cum+=fa.seq.length, cum / total_bases.to_f].join("\t")
  rescue Errno::EPIPE
    break
  end
end
