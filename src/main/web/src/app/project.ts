export interface Project {
    id: string,
    name: string;
    description: string;
    thumbnail: string;
    role: string;
    details: string;
    startDate: Date;
    endDate: Date;
    company: string;
    tags: string[];
}
