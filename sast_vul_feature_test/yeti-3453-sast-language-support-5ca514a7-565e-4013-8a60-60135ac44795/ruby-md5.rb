require "digest"
def weak_hash(input_value)
  Digest::MD5.hexdigest(input_value)
end