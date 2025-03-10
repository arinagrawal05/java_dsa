def bit_stuffing(data):
    stuffed_data = []
    count = 0
    for bit in data:
        stuffed_data.append(bit)
        if bit == 1:
            count += 1
        else:
            count = 0

        if count == 5:
            stuffed_data.append(0)
            count = 0

    return stuffed_data

def add_flags(data):
    flag = [0, 1, 1, 1, 1, 1, 1, 0]
    return flag + data + flag

def hdlc_protocol(data_bits):
    stuffed_data = bit_stuffing(data_bits)
    framed_data = add_flags(stuffed_data)
    return framed_data

def print_bits(bits):
    print("".join(str(bit) for bit in bits))

if __name__ == "__main__":
    data_bits = [1,1,1,1,0,1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0]    
    print("Original Data Bits:")
    print_bits(data_bits)
    framed_data = hdlc_protocol(data_bits)
    print("\nFramed Data with HDLC protocol:")
    print_bits(framed_data)
