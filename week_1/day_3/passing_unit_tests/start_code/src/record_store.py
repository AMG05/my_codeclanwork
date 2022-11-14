def get_name(record_store):
    return record_store['name']

def find_record_by_title(title, record_store):
    for record in record_store['records']:
        if record['title'] == title:
            return record
    return None

def sell_record(record, shop):
    price_of_record = record["price"]
    shop["money"] += price_of_record
    shop["records"].remove(record)