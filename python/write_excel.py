# Import pandas, ExcelFile and ExcelWriter
import pandas
from pandas import ExcelWriter

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

dataframe = pandas.DataFrame(data)

writer = ExcelWriter("vehicles_data.xlsx")

dataframe.to_excel(writer, sheet_name="Sheet1", index=False)

writer.close()

print(pandas.read_excel("vehicles_data.xlsx"))
