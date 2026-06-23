# import pandas
import pandas as pd

# Structure our data as a dictionary
data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}

# Create a new DataFrame using the data
dataframe = pd.DataFrame(data)

# Write the data to a csv file
dataframe.to_csv("vehicles_data.csv")

df2 = pd.read_csv("vehicles_data.csv")

print(df2)